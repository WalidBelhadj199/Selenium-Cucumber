pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Exécutez ici la commande de build, par exemple :
                // sh 'mvn clean install'  // Pour un projet Maven
                // sh 'gradle build'       // Pour un projet Gradle
            }
        }

        stage('Test') {
            steps {
                echo 'Running Cucumber tests...'
                // Exécutez vos tests Cucumber. Par exemple, si vous utilisez Maven :
                sh 'mvn clean test -Dcucumber.options="--plugin json:target/cucumber-report.json"'
                // Pour Gradle, cela pourrait être :
                // sh './gradlew test --cucumber-plugin json:target/cucumber-report.json'
            }
        }
        
        stage('Publish Cucumber Report') {
            steps {
                echo 'Publishing Cucumber report...'
                // Publier le rapport Cucumber en utilisant le plugin Cucumber
                cucumber 'target/cucumber-report.json'
            }
        }
    }
}
