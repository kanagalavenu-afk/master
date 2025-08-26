// Jenkinsfile (Declarative Pipeline)
    pipeline {
        agent any
        stages {
            stage('Load and Execute Groovy Script') {
                steps {
                    script {
                        def myUtils = load 'clone.groovy' // Load the script

                        // Call methods from the loaded script
                        //echo myUtils.greet('Jenkins')
                       // def sum = myUtils.calculateSum(5, 10)
                       // echo "The sum is: ${sum}"
                    }
                }
            }
        }
    }
