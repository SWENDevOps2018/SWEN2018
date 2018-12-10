
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'mvn clean package'
                bat 'docker build . -t tomcatwebserver:${emv.BUILD_ID}
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
