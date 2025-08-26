groovy
// Define the repository URL and the target directory
def repoUrl = "https://github.com/kanagalavenu-afk/master.git"
def targetDir = "C:\Users\vkanagala\testdata"

// Construct the git clone command
def gitCloneCommand = "git clone ${repoUrl}"

// Create a File object for the target directory to run the command in
def workingDir = new File(targetDir)

// Execute the command, specify the working directory, and wait for it to complete
def process = gitCloneCommand.execute(null, workingDir)
process.waitFor()

// Get and print the output and error streams for debugging
def output = process.in.text
def error = process.err.text

if (process.exitValue() == 0) {
    println "Repository cloned successfully to ${workingDir.absolutePath}"
} else {
    println "Git clone failed with exit code ${process.exitValue()}"
    println "Error output:\n${error}"
}
