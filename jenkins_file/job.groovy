def repo = "https://github.com/Tighrine/jenkins_automate_jobs.git"

job("job-V1"){
    scm{
        git(repo)
    }
    steps{
        shell('docker-compose up')
    }
}