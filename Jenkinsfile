
pipeline {
    agent any

    stages {
        stage('Build') {
                           
            steps {
                echo 'Building..'
                withMaven(maven: 'localMaven')
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
