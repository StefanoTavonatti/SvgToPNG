SvgToPng is a piece software that can help a developer to create icons for an Android project. This software takes as input a SVG image file, creates a series of PNG image with the right size and puts it in the corrects folders.

**Install**

Download last build from [here](https://github.com/StefanoTavonatti/SvgToPNG/releases "") and simply run the jar file, or compile it yourself.

**Compile**

Download and install last version of maven on your system

```bash
cd SvgToPNG
mvn package
```

run the project with:
```bash
java -jar target/SvgToPNG-resizer-1.0-SNAPSHOT-jar-with-dependencies.jar
```

**How to use the application**

![home.png](screenshot/home.png?raw=true "1.1 Home screen")

Type the path of your SVG file in the first input field, or click the nearby button to open a standard file chooser and select your file.

Type the path of your Android project’s resource folder in the second input field, or click the nearby button to open a file chooser and select the folder.

If you want to export icon files with the standard setting click on “Convert” button, else click on “Setting” button to open the setting screen (picture 1.2). 
New icons will put in rights folders and will be saved with the same name as the input file.

![Settings.png](screenshot/Settings.png?raw=true "1.2 Settings screen")

In this screen you can choose the size of icons that you want to create. The first row allow you to select one of the standard preset already present or create a new one. 

You can customize the size of icons with the input fields below. If you check the “lock size” checkbox you need to fill only the width field and the software adjust height of icons in order to maintain the right proportion of images. 