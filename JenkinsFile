pipeline {
    agent {
        docker {
            image: mcr.microsoft.com/playwright
        }
        stages{
            stage('tests'){
                steps{
                    sh 'mvn -B install -D skipTests --no-transfer-progress'
                    sh 'mvn test'
                }
            }
        }
    }
}
