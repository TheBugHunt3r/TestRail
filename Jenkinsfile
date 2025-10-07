pipeline {
    agent any

    tools {
        maven 'M3' // Maven должен быть настроен в Jenkins → Global Tool Configuration
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=true"
    }

    stages {
        stage('Build & Test') {
            steps {
                echo '🔧 Запускаем тесты через Maven'
                sh 'mvn clean test'
            }
        }

        stage('Generate Allure Report') {
            steps {
                echo '📊 Генерируем Allure отчёт'
                sh 'mvn allure:report'
            }
        }

        stage('Publish Allure Report') {
            steps {
                echo '🚀 Публикуем Allure отчёт в Jenkins'
                allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
            }
        }
    }

    post {
        always {
            echo '📦 Архивируем артефакты и отчёты'
            archiveArtifacts artifacts: 'target/allure-results/**', allowEmptyArchive: true
            junit '**/target/surefire-reports/TEST-*.xml'
        }
        failure {
            echo '❌ Билд упал — проверь логи и отчёты'
        }
        success {
            echo '✅ Всё прошло — отчёты готовы'
        }
    }
}
