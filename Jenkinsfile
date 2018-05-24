pipeline {
	agent {
		docker {
			image 'maven:3-alpine' 
			args '-v /root/.m2:/root/.m2' 
		}
	}
	stages {
		stage('Build') { 
			steps {
				sh 'mvn -B -DskipTests clean package' 
			}
		}
		stage('Test') {
			steps {
				sh 'mvn -e test'
			}
			post {
				always {
					junit 'target/surefire-reports/*.xml'
				}
			}
		}
		
	}
	post {
        	always {
			emailext body: '${BUILD_LOG, maxLines=9999, escapeHtml=false}', subject: ' Build & Test log', to: "jose.turegano@panel.es"

        	}
    	}
}
