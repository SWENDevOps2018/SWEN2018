
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn clean package'
            }
            post {
                success {
                    echo 'Build was successful...'
                }
            }
        }
         
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
