package week01.theMOP

File.metaClass.getText = { ->
    "my canned data"
}

def readFileContents(fileName) {
    new File(fileName).getText()
}

println readFileContents('blah.txt')