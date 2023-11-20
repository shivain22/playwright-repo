pipeline {
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
