# Final Project by Meggan Pereyra

For this final project, I wanted to go back on when i first started learning programming. 
I reflected on some of the amazing projects that i worked on and how it taught me a little more on java and general OOP concepts. 
One of the Projects i did was a simple, get very useful, Task Manager. 
So for this project, i decided to develop a whole new task manager that includes three key data structures to make it work!

1. ArrayList
2. HashMap
3. TreeSet

Let's get started!

# Task Manager
This project will create a simple To-Do list app that will allow users to manage their day to day by viewing, adding, and removing daily tasks! This README will provide information on each file to explain the features and structures of the application. Each section will be titled by the class file name and will give a description of the structure of the class and how the code is implemented. To make this an easy-to-read file, here is a table of content
* Contribution
* Task.java
* TaskManager.java
* ToDoListManager.java
* TaskPriorityComparator
* Main.java
* Resources
* Final Note

# Contribution
I was contemplating working with another student but decided ultimately that i felt more comfortable working solo for this project as i wanted to be in full control of the design and layout. I like my work to be a reflection of my ambition and discipline in the software field and i felt this would be more efficiently portraid if i did everything on my own! I hope to give a great reflection of my technical skills through this project.

# Task.java
This task class is going to represent each individual task in our To-Do list Manager. The properties this class contains is:
    1. title
    2. description
    3. priority
    4. isComplete
properties 1-3 are a little self explanatory and each one has comments within the code to describe exactly what it is doing. The isComplete property is used to store relevant information in regards to each task. 
Throughout this class you will see the 'getters' and 'setters' that will allow us to access and modify each and all properties. The Task class is also used to override 'toString()' method so there is a custom string representation for all tasks. This makes the application more suitable for users.

# TaskManager.java
This class an interface / contract to manage tasks in the To-Do List. In this class, several methods are declared that any implementing class provides: adding a new task, marking complete tasks, sorting tasks by priority, getting completed tasks, and removing tasks.
The interface really serves as a base or a blueprint for our ToDoListManager class. This is to ensure that this class adheres to the specified tasks behavior.

# ToDoListManager.java
The ToDoListManager is really the core of this application. It implements our TaskManager interface. It uses a variety of data structures but the most vital ones are:
1. ArrayList
2. HashSet
3. Hashmap
These are vital to making the program run efficiently. These data structures will aid in keeping track of all tasks. completed tasks, and task titles to prevent duplicates. It provides implementations for all the methods defined in our TaskManager interface. This includes:
    * Adding tasks
    * Marking tasks
    * Getting sorted tasks
    * Retrieving tasks
    * Removing tasks

# TaskPriorityComparator.java
This class implements our comparator interface. This is done to compare tasks based on their priority. We use this in the ToDoListManager class for sorting tasks by priority when the user retrieves all the tasks sorted in priority. By implementing this, our ToDoListManager can easily sort the tasks based on their priority level.

# Main.java
Finally, we get to our main class. Here, i test the application by coding an example task. This is done to test and view the functionality mostly of our ToDoListManager class. When you view the class, you will see i added some example tasks, marked two as complete, i viewed the tasks, and removed tasks. This class creates an instance of the ToDoListManager class and it also interacts with it to showcase various features my Task Manager has!

# Resources
* in APA format
1. Cooperative Task Management Without Manual Stack Management. Check out the new USENIX Web site. (n.d.). https://www.usenix.org/legacy/event/usenix02/full_papers/adyahowell/adyahowell_html/ 
2. What A to-do: Studies of task management towards the design of a ... (n.d.). https://www.researchgate.net/publication/221518959_What_a_to-do_studies_of_task_management_towards_the_design_of_a_personal_task_list_manager 
3. GeeksforGeeks. (2023, July 21). Object Oriented Programming (OOPS) concept in Java. GeeksforGeeks. https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/ 


# Final note
This was an amazing experience. I loved getting to merge the concepts i learned in this class with java and object oriented programming
I think this application is very useful for those who have to manage alotof tasks during the day. I know for me personally, it is 
very useful! 

Note to professor: thank you for dedicating time and excellence to this class. I appreciate all your hard work for your students! Have an amazing rest of the summer
