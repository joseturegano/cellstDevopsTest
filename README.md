# cellstDevopsTest

Welcome to the simple Jenkins Pipeline test for members of the Devops Cellst Team. The objective is to ask you a simple exercise that allows us to see how you handle with Jenkins.

First of all we need you to have Docker installed and that you are familiar with the basic lifecycle of applications built with java. We need you to setup a Jenkins with Docker and perform the following actions on this example project:
1) Download the sources of the project from https://github.com/joseturegano/cellstDevopsTest.git
2) Test Execution of the project's artifact (to be passed successfully).
3) Send an email to jose.turegano@panel.es with the log of the execution of the project.

To do this, insided the project folder there is an empty Jenkinsfile where you will have to develop, if possible, a Declarative Jenkins Pipeline that solves the mentioned problem. Once finished, make a Pull Request, please.

Information of interest:
- Use the following image to run your docker: jenkinsci/blueocean
- Use an agent in the pipeline based on the image maven:3-alpine
- The modeling of the project is prepared to use maven as a construction tool.
- Use the Pipeline steps to send the mail.
