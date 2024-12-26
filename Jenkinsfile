pipeline {
    agent any  // Utilisation d'un agent disponible

    environment {
        GIT_CREDENTIALS = credentials('Jenkins')  // ID des identifiants pour le dépôt Git
    }

    stages {
        // Etape de clonage du dépôt Git
        stage('Clone') {
            steps {
                git(
                    url: 'https://github.com/WalidBelhadj199/selenium-cucumber.git',
                    credentialsId: GIT_CREDENTIALS
                )
            }
        }

        // Etape de build
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Exécutez ici la commande de build, par exemple :
                // sh 'mvn clean install'  // Pour un projet Maven
                // sh 'gradle build'       // Pour un projet Gradle
            }
        }

        // Etape de test (par exemple, tests Cucumber)
        stage('Test') {
            steps {
                echo 'Running Cucumber tests...'
                // Exécutez vos tests Cucumber. Par exemple, si vous utilisez Maven :
                bat 'mvn clean test -Dcucumber.options="--plugin json:target/report/cucumber.json"'
                // Pour Gradle, cela pourrait être :
                // sh './gradlew test --cucumber-plugin json:target/cucumber-report.json'
            }
        }

        // Etape de publication du rapport Cucumber
        stage('Publish Cucumber Report') {
            steps {
                echo 'Publishing Cucumber report...'
                // Publier le rapport Cucumber en utilisant le plugin Cucumber
                cucumber 'target/report/cucumber.json'
            }
        }

        // Etape de déploiement
        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                // Remplacez ceci par la commande de déploiement, par exemple :
                // sh 'mvn deploy' // Pour un projet Maven
                // sh './gradlew deploy' // Pour un projet Gradle
            }
        }
    }

    post {
        always {
            echo 'This will always run after the pipeline finishes.'
        }
        success {
            echo 'This will run only if the pipeline is successful.'
        }
        failure {
            echo 'This will run if the pipeline fails.'
        }
    }
}
