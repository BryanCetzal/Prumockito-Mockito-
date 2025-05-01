pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git credentialsId: '37d38d4b-e965-4209-bb8e-a343a6d9ae6e', url: 'https://github.com/BryanCetzal/Prumockito-Mockito-.git'
            }
        }
        stage('Build') {
            steps {
                sh 'docker build -t prumockito .'
            }
        }
        stage('Test') {
            steps {
                sh 'docker run prumockito tests'
            }
        }
    }
}
