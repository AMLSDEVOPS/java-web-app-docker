def call() {
    slackSend(
        channel: 'deployment-test',
        color: 'good', // Using 'good' color for SUCCESS
        message: "STARTED: ${env.JOB_NAME} #${env.BUILD_NUMBER} by ${currentBuild.getBuildCauses()[0].userId}"
    )
}
