def call() {
    slackSend(
        channel: 'deployment-test',
        color: currentBuild.currentResult == 'SUCCESS' ? 'good' : (currentBuild.currentResult == 'FAILURE' ? 'danger' : 'warning'),
        message: "${currentBuild.currentResult}: Job ${env.JOB_NAME} #${env.BUILD_NUMBER} by ${currentBuild.getBuildCauses()[0].userId}\n<${env.BUILD_URL}|Open>"
    )
}
