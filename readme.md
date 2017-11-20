Ethernet POWERLINK XDD Editor plugin{#mainpage}
=============

## Ethernet POWERLINK XDD Editor - Eclipse plugin

Ethernet POWERLINK XDD Editor an Open-Source tool, which can be
used to create or edit POWERLINK device description file. The tool is available as
SourceForge project.

## License

Ethernet POWERLINK XDD Editor is Open Source software (OSS) and is licensed under the
BSD license.

## Documentation

The documentation of the Ethernet POWERLINK XDD Editor plugin can be found in the
subdirectory "doc". It is written in _markdown_ markup format.
The documentation can be generated from the markdown
documentation and the in-source documentation with the tool
[Doxygen](http://www.doxygen.org). Doxygen version 1.8 or higher is required.

To generate the software manual:

      > cd doc/
      > doxygen

The software manual will be created in HTML format under
`doc/html`.

## Contributors

(c) Kalycito Infotech Private Limited,
    <http://www.kalycito.com>

(c) B&R Industrial Automation GmbH,
    B&R Strasse 1,
    A-5142 Eggelsberg,
    <http://www.br-automation.com>

## Links and References

- Ethernet POWERLINK Standardization Group:
  <http://www.ethernet-powerlink.org>

## Compilation steps

### Pre-requisites:

- JDK of version 1.8 or above.
- Apache-maven 3.3.3 or above.

### Maven installation steps:

#### Windows x86 and x86_64:

- Download "apache-maven-3.3.3" or above.
- Add "bin" directory of maven package to the target system path by updating it into system's environment variables with variable name MAVEN_HOME or by using command terminal
        Set PATH = "C:\Program Files\apache-maven-3.3.3\bin";%PATH%

- Add bin directory of JDK to the target system path by updating it into system's environment variables with variable name JAVA_HOME
- OR by using command terminal
        Set JAVA_HOME = "C:\program files\jdk1.8.0_45\bin";%JAVA_HOME%

#### Linux x86 and x86_64:

- Install maven into the target system using software centre OR
- by using the following command in a terminal
        sudo apt-get install maven

- Set the path to Ethernet POWERLINK XDD Editor plugin code as the working directory.
- Execute the following command to build the package
        mvn clean compile package
- The final built output package will be available in the com.br_automation.buoat.xddeditor.updatesite/target directory.

