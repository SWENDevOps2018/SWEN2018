
pipeline {
    agent any

    stages {
        stage('Build') {
            withMaven(maven: 'localMaven')
                
            steps {
                echo 'Building..'
                bat 'mvn clean package'
                bat 'docker build . -t swenapp:${env.BUILD_ID}'
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
