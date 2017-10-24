//Edit in web console: http://groovyconsole.appspot.com/script/5086474269622272

rawItems = '''

    /**  */
    protected Integer age;

    /**  */
    protected String name = "";

    /**  */
    protected String lastName = "";

'''


cleanLines = (rawItems.split(";").collect { cleanString(it) } as TreeSet).join("\n")

def cleanString(String value) { value.replace("protected", "").replace("private", "").replace("/", "").replace("*", "").replace("=", "").replace("\"", "").trim() }

println cleanLines
