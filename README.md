# Groovy syntax example to curl

Demonstration of Groovy language command line curl.

## Installation

Homepage [groovy](https://groovy-lang.org/install.html) provides information for most installations.
[chocolatey]('https://chocolatey.org/packages/groovy') also provides a package.

```bash
groovy curl.groovy
```
running the script once groovy is installed is as simple as typing above in the command line.
## Usage

```groovy
//step through the code
//proc short for process calls the shell command
def proc 'curl -L http://www.wherethetruck.is'.execute() // .execute() is required to kick it off
proc.waitFor() //method to wait for process to complete
println proc.err.text // catch for error call to print if error occurs
println proc.text // call to print to terminal results of curl

```

## Contributing
This is simply here for educational or reference purposes.
Thanks for checking it out!


## License
[MIT](https://choosealicense.com/licenses/mit/)
