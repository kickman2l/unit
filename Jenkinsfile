node() {
    stage('checkout') {
        checkout(scm)
        sh 'git clean -xdf'
    }
    stage('build and test') {
        sh './gradlew build'
        junit 'build/test-results/test/*.xml'
    }
}