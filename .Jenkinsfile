// Jenkinsfile (Declarative Pipeline)
    pipeline {
        agent any
        stages {
            stage('clone') {
                steps {
                    script {
                        def myUtils = load 'clone.groovy' // Load the script
                            myUtils.process()

                        // Call methods from the loaded script
                        //echo myUtils.greet('Jenkins')
                       // def sum = myUtils.calculateSum(5, 10)
                       // echo "The sum is: ${sum}"
                    }
                }
            }
        }
    }
