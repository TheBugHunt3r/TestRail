pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/TheBugHunt3r/TestRail.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Generate Allure Report') {
            steps {
                sh 'mvn allure:report'
                sh 'mvn allure:serve' // если хочешь локально открыть
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/allure-results/**', allowEmptyArchive: true
        }
    }
}