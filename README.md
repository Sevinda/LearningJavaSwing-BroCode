# LearningJavaSwing - BroCode

JFrame = a GUI window to add components to

Creating a frame => 
`JFrame frame = new JFrame();`

**Nothing will happen if we run it. We need to <span style="color: green">setVisibility(true)</span>.**

Make frame visible => `frame.setVisible(true);`

**To make the frame bigger use <span style="color: green">setSize(width, height)</span>**

Set size of frame => `frame.setSize(420, 420)`

**To give a title use <span style="color: green">setTitle("Title of the frame")</span>**

Set Title => `frame.setTitle("Title of the frame")`

**The default red cross will not close the program. It will just hide it.
To close the program use <span style="color: green">setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)</span>**

Exit the program => `frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)`

**To prevent frame from being resized use <span style="color: green">setResizable(false)</span>**

Resizable => `frame.setResizable(false)`

**To set an image you first have to create an image instance**

`ImageIcon image = new ImageIcon("logo.png")`

where logo.png is the filename.

**To set it to the logo of the frame use <span style="color: green">setIconImage()</span>**

Set Image => `frame.setIconImage(image.getImage())`
