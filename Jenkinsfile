
pipeline {
    agent any
    def buildNumber = env.BUILD_NUMBER
    def workspace = env.WORKSPACE
    def buildUrl = env.BUILD_URL
    / PRINT ENVIRONMENT TO JOB
    echo "workspace directory is ${workspace}"
    echo "build URL is ${env.BUILD_URL}"
    
    stages {
        stage('Build') {
                           
            steps {
                echo 'Building..'
                withMaven(maven: 'localMaven'){
                bat 'mvn clean package'
                bat 'docker build . -t swenapp:${env.BUILD_ID}'
                }
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
