package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import java.util.ArrayList;

import static com.Discord.DiscordBot.Units.QuestionBank.unit1Questions;

public class Unit1 {

    public static int numUnit1Questions;

    // Replace unit4Questions with unit1Questions.add
    public static void initializeUnit1Questions() {
        unit1Questions.add(new Question(
                "Which of the following best describes the purpose of a computational artifact?",
                "A tool created by humans to solve a problem or perform a task",
                "A random sequence of numbers",
                "A program that cannot be modified",
                "A theoretical concept with no practical use",
                "A", 1, 0, "easy"));

        unit1Questions.add(new Question(
                "In AP CSP, what is meant by 'creativity' in computing?",
                "Using existing programs without modification",
                "Finding new ways to solve problems using computing",
                "Copying code from others",
                "Focusing only on syntax",
                "B", 1, 1, "easy"));

        unit1Questions.add(new Question(
                "Which of the following is an example of a computational artifact?",
                "A Java class",
                "A painting",
                "A baked cake",
                "A written essay",
                "A", 1, 2, "easy"));

        unit1Questions.add(new Question(
                "Which statement is true about developing computational artifacts?",
                "They must always be written in Java",
                "They are created to meet a need or purpose",
                "They cannot be shared with others",
                "They are only theoretical",
                "B", 1, 3, "easy"));

        unit1Questions.add(new Question(
                "Why is iteration important in creating computational artifacts?",
                "It allows you to repeat a process to refine and improve the artifact",
                "It makes programs run slower",
                "It prevents debugging",
                "It removes all errors automatically",
                "A", 1, 4, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best demonstrates abstraction in creative development?",
                "Focusing on only the relevant details to simplify a problem",
                "Including every possible detail in your program",
                "Avoiding problem-solving entirely",
                "Copying someone else's solution",
                "A", 1, 5, "medium"));

        unit1Questions.add(new Question(
                "What role does testing play in creative development?",
                "It helps ensure the artifact works as intended and meets its purpose",
                "It is unnecessary in CSP",
                "It only matters for multiple-choice exams",
                "It should be skipped for efficiency",
                "A", 1, 6, "easy"));

        unit1Questions.add(new Question(
                "A student wants to create an interactive story using code. Which step demonstrates creative development?",
                "Planning the story structure and coding interactions",
                "Copying a story from a book",
                "Ignoring user input",
                "Printing the same line repeatedly",
                "A", 1, 7, "medium"));

        unit1Questions.add(new Question(
                "Which is an example of using data in creative development?",
                "Analyzing user choices to adjust the program's behavior",
                "Ignoring user input completely",
                "Hardcoding all values without logic",
                "Printing static text only",
                "A", 1, 8, "medium"));

        unit1Questions.add(new Question(
                "What is an important characteristic of a well-designed computational artifact?",
                "It solves a problem or fulfills a purpose effectively",
                "It uses as much code as possible",
                "It is always written in Java",
                "It is kept secret and never shared",
                "A", 1, 9, "easy"));

        unit1Questions.add(new Question(
                "Which step comes first in creative development?",
                "Defining the problem or purpose",
                "Debugging the program",
                "Optimizing performance",
                "Publishing the artifact",
                "A", 1, 10, "easy"));

        unit1Questions.add(new Question(
                "How can collaboration enhance creative development?",
                "By combining ideas and feedback to improve the artifact",
                "By copying code from teammates without understanding",
                "By ignoring others' input entirely",
                "By avoiding sharing work until final submission",
                "A", 1, 11, "medium"));

        unit1Questions.add(new Question(
                "Which of the following describes prototyping in CSP?",
                "Creating a preliminary version to test ideas and get feedback",
                "Writing the final code immediately without testing",
                "Skipping planning and documentation",
                "Only working alone without collaboration",
                "A", 1, 12, "medium"));

        unit1Questions.add(new Question(
                "Why is user feedback important in developing computational artifacts?",
                "It helps improve usability and effectiveness of the program",
                "It is optional and rarely useful",
                "It slows down development without benefit",
                "It is only needed for exams",
                "A", 1, 13, "medium"));

        unit1Questions.add(new Question(
                "Which scenario demonstrates iteration in creative development?",
                "Revising a program multiple times based on testing results",
                "Running the program once and never revising it",
                "Deleting code randomly",
                "Ignoring errors and moving on",
                "A", 1, 14, "medium"));

        unit1Questions.add(new Question(
                "What does it mean to evaluate a computational artifact?",
                "Assessing whether it achieves its purpose and meets criteria",
                "Printing the code without running it",
                "Ignoring errors completely",
                "Writing as much code as possible",
                "A", 1, 15, "easy"));

        unit1Questions.add(new Question(
                "Which is an example of a computational artifact that impacts society?",
                "A mobile app that helps users track health goals",
                "A handwritten story in a notebook",
                "A printed brochure with no interactive features",
                "A wooden sculpture",
                "A", 1, 16, "medium"));

        unit1Questions.add(new Question(
                "When designing an artifact, why is considering the audience important?",
                "To ensure it is useful and understandable to intended users",
                "It is not important in CSP",
                "It only matters for aesthetics",
                "It makes code run faster",
                "A", 1, 17, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best describes the iterative design process?",
                "Repeatedly refining a solution based on testing and feedback",
                "Writing code once and never reviewing it",
                "Randomly changing code",
                "Ignoring testing and feedback",
                "A", 1, 18, "medium"));

        unit1Questions.add(new Question(
                "Which is a key goal of creative development in AP CSP?",
                "To produce a computational artifact that solves a problem creatively",
                "To memorize code syntax only",
                "To copy existing programs without understanding",
                "To avoid user interaction",
                "A", 1, 19, "easy"));

        unit1Questions.add(new Question(
                "Which of the following is an example of abstraction in CSP?",
                "Creating a function to perform a task without exposing implementation details",
                "Writing all steps explicitly each time",
                "Copying code from a textbook",
                "Ignoring the problem requirements",
                "A", 1, 20, "medium"));

        unit1Questions.add(new Question(
                "Why is planning important before creating a computational artifact?",
                "It helps organize ideas and define steps to achieve the goal",
                "It slows down development unnecessarily",
                "It is only required for exams",
                "It guarantees the artifact will be perfect on the first try",
                "A", 1, 21, "medium"));

        unit1Questions.add(new Question(
                "Which of these is a valid reason to create a computational artifact?",
                "To solve a problem or support a specific task",
                "To use up programming time",
                "To make code as complex as possible",
                "To copy someone else's work",
                "A", 1, 22, "easy"));

        unit1Questions.add(new Question(
                "How can iteration improve a computational artifact?",
                "By allowing multiple revisions to enhance functionality and usability",
                "By making the program run once and then stop",
                "By removing user input entirely",
                "By ignoring errors in code",
                "A", 1, 23, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best describes testing in creative development?",
                "Running the artifact to find errors and improve functionality",
                "Avoiding execution to save time",
                "Changing code randomly without testing",
                "Asking peers to write the code for you",
                "A", 1, 24, "medium"));

        unit1Questions.add(new Question(
                "Which step involves receiving feedback from users to improve an artifact?",
                "Evaluation",
                "Abstraction",
                "Iteration",
                "Algorithm design",
                "A", 1, 25, "medium"));

        unit1Questions.add(new Question(
                "Why is collaboration important in developing computational artifacts?",
                "It allows sharing ideas and solving problems more effectively",
                "It guarantees the artifact will be correct without testing",
                "It is only useful for grading",
                "It replaces the need to plan",
                "A", 1, 26, "medium"));

        unit1Questions.add(new Question(
                "Which of the following demonstrates creative problem solving in CSP?",
                "Designing a unique program to help users track tasks",
                "Copying a template from the internet",
                "Printing static text only",
                "Ignoring user needs",
                "A", 1, 27, "medium"));

        unit1Questions.add(new Question(
                "Which of these is an example of a computational artifact that demonstrates creativity?",
                "An interactive quiz application designed for students",
                "A standard calculator with no unique features",
                "A printed textbook page",
                "A handwritten list of tasks",
                "A", 1, 28, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is a key principle of creative development in AP CSP?",
                "Designing artifacts to meet a purpose while demonstrating originality",
                "Writing as much code as possible",
                "Avoiding testing and feedback",
                "Copying existing solutions without understanding",
                "A", 1, 29, "easy"));

        unit1Questions.add(new Question(
                "Which scenario demonstrates user-centered design?",
                "Designing a program based on user needs and feedback",
                "Ignoring user input completely",
                "Making the program only for the developer",
                "Using random features without purpose",
                "A", 1, 30, "medium"));

        unit1Questions.add(new Question(
                "Why is documenting a computational artifact important?",
                "It helps others understand how the artifact works and how to use it",
                "It is unnecessary in CSP",
                "It makes code run faster",
                "It replaces testing",
                "A", 1, 31, "medium"));

        unit1Questions.add(new Question(
                "Which step in creative development ensures that the artifact achieves its intended purpose?",
                "Evaluation",
                "Abstraction",
                "Iteration",
                "Prototyping",
                "A", 1, 32, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is an example of a prototype?",
                "A basic version of a program to test ideas and gather feedback",
                "The final polished program",
                "A diagram with no code",
                "Copying someone else’s program",
                "A", 1, 33, "medium"));

        unit1Questions.add(new Question(
                "Why is it important to consider ethical implications in creative development?",
                "To ensure the artifact does not harm users or society",
                "It is optional and rarely relevant",
                "It only matters for the teacher",
                "It is only needed for performance tasks",
                "A", 1, 34, "medium"));

        unit1Questions.add(new Question(
                "Which practice allows you to simplify a complex problem when developing an artifact?",
                "Abstraction",
                "Iteration",
                "Prototyping",
                "Evaluation",
                "A", 1, 35, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is an example of feedback in creative development?",
                "Users report issues with the program’s interface",
                "Ignoring user concerns",
                "Deleting the artifact without testing",
                "Writing code without review",
                "A", 1, 36, "medium"));

        unit1Questions.add(new Question(
                "Which type of computational artifact could be considered creative?",
                "A simulation that teaches a new concept interactively",
                "A printed textbook page",
                "A calculator with fixed operations",
                "A static image",
                "A", 1, 37, "medium"));

        unit1Questions.add(new Question(
                "How does iteration relate to improving a computational artifact?",
                "By repeating development cycles to refine and enhance the artifact",
                "By creating it once and never revisiting it",
                "By ignoring user input",
                "By skipping testing entirely",
                "A", 1, 38, "medium"));

        unit1Questions.add(new Question(
                "Which of the following demonstrates effective use of resources in creative development?",
                "Using libraries or existing code components to save time and increase functionality",
                "Copying entire projects without understanding",
                "Writing code without planning",
                "Ignoring available tools and documentation",
                "A", 1, 39, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is a benefit of using pseudocode in creative development?",
                "It allows planning logic before actual coding",
                "It replaces the need for testing",
                "It guarantees the program will run without errors",
                "It is only used for grading",
                "A", 1, 40, "medium"));

        unit1Questions.add(new Question(
                "Why is defining the problem important in creative development?",
                "It ensures that the artifact addresses the correct need or goal",
                "It is optional and rarely necessary",
                "It slows down development unnecessarily",
                "It only matters for exams",
                "A", 1, 41, "easy"));

        unit1Questions.add(new Question(
                "Which example demonstrates abstraction in a program?",
                "Creating a function to calculate area without showing the detailed steps each time",
                "Writing the same calculation manually in multiple places",
                "Copying code from another program",
                "Ignoring the problem requirements",
                "A", 1, 42, "medium"));

        unit1Questions.add(new Question(
                "How does testing improve a computational artifact?",
                "By identifying errors and confirming functionality meets requirements",
                "By making the program run automatically",
                "By eliminating the need for coding",
                "By only focusing on aesthetics",
                "A", 1, 43, "medium"));

        unit1Questions.add(new Question(
                "Which scenario demonstrates iteration in creative development?",
                "Revising a program multiple times based on testing results",
                "Writing code once and never modifying it",
                "Ignoring feedback from users",
                "Skipping prototyping entirely",
                "A", 1, 44, "medium"));

        unit1Questions.add(new Question(
                "Why is user-centered design important in AP CSP?",
                "It ensures the program meets the needs and expectations of its intended audience",
                "It is not necessary for small projects",
                "It only applies to theoretical work",
                "It guarantees the program will be graded perfectly",
                "A", 1, 45, "medium"));

        unit1Questions.add(new Question(
                "Which action demonstrates collaboration in creative development?",
                "Sharing ideas and reviewing code with team members to improve the artifact",
                "Ignoring teammates and working alone",
                "Copying someone else’s solution",
                "Submitting work without discussion",
                "A", 1, 46, "medium"));

        unit1Questions.add(new Question(
                "Which of these best represents an innovative computational artifact?",
                "An app that uses user input in a new way to solve a common problem",
                "A static webpage with fixed text",
                "A calculator with only basic operations",
                "A printed textbook page",
                "A", 1, 47, "medium"));

        unit1Questions.add(new Question(
                "What is the purpose of prototyping in CSP?",
                "To create an early version of the program to test ideas and gather feedback",
                "To finalize the program immediately",
                "To avoid testing and evaluation",
                "To copy code from others",
                "A", 1, 48, "medium"));

        unit1Questions.add(new Question(
                "Which describes effective documentation of a computational artifact?",
                "Clear explanations of how the artifact works and how to use it",
                "Ignoring comments entirely",
                "Only writing code without explanation",
                "Using vague terms that are hard to follow",
                "A", 1, 49, "medium"));

        unit1Questions.add(new Question(
                "Why is it important to consider ethical implications in computing?",
                "To ensure the artifact does not cause harm or unintended consequences",
                "It is unnecessary for most projects",
                "It only matters for exams",
                "It guarantees success without testing",
                "A", 1, 50, "medium"));

        unit1Questions.add(new Question(
                "Which example demonstrates evaluation of a computational artifact?",
                "Testing the program to see if it meets the intended purpose",
                "Writing code without running it",
                "Ignoring feedback from users",
                "Copying code from a textbook",
                "A", 1, 51, "medium"));

        unit1Questions.add(new Question(
                "Which demonstrates effective use of abstraction?",
                "Using a function to hide complex calculations and simplify code usage",
                "Repeating the same code in multiple places",
                "Copying code from another program",
                "Ignoring program structure",
                "A", 1, 52, "medium"));

        unit1Questions.add(new Question(
                "How does iteration help improve a computational artifact?",
                "It allows developers to refine and enhance the program over multiple versions",
                "It makes the program run slower",
                "It is unnecessary in small programs",
                "It guarantees the artifact will never have bugs",
                "A", 1, 53, "medium"));

        unit1Questions.add(new Question(
                "Which of the following shows creative problem-solving in CSP?",
                "Designing a unique solution to meet a specific user need",
                "Copying existing code without modification",
                "Using only pre-built templates",
                "Ignoring problem requirements",
                "A", 1, 54, "medium"));

        unit1Questions.add(new Question(
                "What is a key goal of the iterative design process?",
                "To improve an artifact through repeated testing and feedback",
                "To write code once and never modify it",
                "To ignore user input entirely",
                "To finish as quickly as possible without testing",
                "A", 1, 55, "medium"));

        unit1Questions.add(new Question(
                "Which of these is an example of creative development?",
                "Building a program that helps users track fitness goals in an interactive way",
                "Printing static text",
                "Writing code only to memorize syntax",
                "Copying a program without understanding it",
                "A", 1, 56, "medium"));

        unit1Questions.add(new Question(
                "Which action best demonstrates collaboration during CSP projects?",
                "Working together to review code and improve solutions",
                "Ignoring teammates entirely",
                "Copying answers from others",
                "Submitting work without communication",
                "A", 1, 57, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best represents user-centered design?",
                "Designing an artifact that meets the needs and feedback of the intended users",
                "Making a program only for the developer",
                "Ignoring user input",
                "Adding features without purpose",
                "A", 1, 58, "medium"));

        unit1Questions.add(new Question(
                "Why is abstraction useful in creative development?",
                "It simplifies complex tasks by focusing on relevant details",
                "It makes code more complicated",
                "It removes the need for planning",
                "It only matters for exams",
                "A", 1, 59, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best defines a computational artifact in AP CSP?",
                "A program or digital creation developed to solve a problem or perform a task",
                "A random collection of numbers",
                "A printed textbook page",
                "A static image",
                "A", 1, 60, "easy"));

        unit1Questions.add(new Question(
                "Why is testing considered an essential part of creative development?",
                "It ensures the artifact behaves as intended and meets its purpose",
                "It is optional and only for grading",
                "It slows down coding unnecessarily",
                "It guarantees no errors without iteration",
                "A", 1, 61, "medium"));

        unit1Questions.add(new Question(
                "Which of these demonstrates iteration during development?",
                "Making multiple versions of a program based on feedback and testing",
                "Writing code once and never revising it",
                "Copying code from a book",
                "Skipping testing completely",
                "A", 1, 62, "medium"));

        unit1Questions.add(new Question(
                "How does user feedback enhance a computational artifact?",
                "It provides insights to improve usability and functionality",
                "It is unnecessary for small programs",
                "It slows down the development process",
                "It guarantees perfection without changes",
                "A", 1, 63, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best describes a prototype?",
                "An early version of a program used to test and refine ideas",
                "The final polished program",
                "A diagram with no code",
                "Copying a program from another student",
                "A", 1, 64, "medium"));

        unit1Questions.add(new Question(
                "What is the main purpose of evaluation in creative development?",
                "To assess whether the artifact achieves its intended goals",
                "To make code more complicated",
                "To replace planning and design",
                "To copy existing solutions",
                "A", 1, 65, "medium"));

        unit1Questions.add(new Question(
                "Which demonstrates effective abstraction in a program?",
                "Using a function to hide complex operations from the main code",
                "Repeating the same code multiple times",
                "Copying code without understanding",
                "Ignoring program structure",
                "A", 1, 66, "medium"));

        unit1Questions.add(new Question(
                "Why is defining the problem important before creating an artifact?",
                "It ensures the solution addresses the correct need",
                "It is optional and rarely necessary",
                "It guarantees the artifact will run without errors",
                "It allows skipping planning",
                "A", 1, 67, "easy"));

        unit1Questions.add(new Question(
                "Which scenario best represents creative problem-solving?",
                "Designing a program that uses new logic to meet user needs",
                "Copying code from an online tutorial",
                "Running a program without modifications",
                "Ignoring the problem requirements",
                "A", 1, 68, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is a key characteristic of a computational artifact?",
                "It solves a problem or performs a task effectively",
                "It is overly complex without purpose",
                "It ignores user input",
                "It is always written in one programming language",
                "A", 1, 69, "easy"));

        unit1Questions.add(new Question(
                "How does collaboration improve creative development?",
                "By sharing ideas and reviewing work to create better solutions",
                "By ignoring teammates and working alone",
                "By copying code from others",
                "By skipping feedback entirely",
                "A", 1, 70, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best describes ethical considerations in CSP projects?",
                "Ensuring the artifact does not harm users or society",
                "They are optional and rarely matter",
                "They only apply to exams",
                "They replace testing",
                "A", 1, 71, "medium"));

        unit1Questions.add(new Question(
                "Which example illustrates user-centered design?",
                "Creating a program that adapts to user preferences and input",
                "Making a program only for the developer",
                "Adding features randomly without purpose",
                "Printing static text only",
                "A", 1, 72, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is an example of iteration in AP CSP?",
                "Refining a program multiple times based on test results and feedback",
                "Running code once without modifications",
                "Copying code from textbooks",
                "Ignoring errors completely",
                "A", 1, 73, "medium"));

        unit1Questions.add(new Question(
                "Why is abstraction useful in developing computational artifacts?",
                "It allows focus on relevant details and simplifies complex processes",
                "It makes code unnecessarily complex",
                "It replaces the need for planning",
                "It guarantees success without testing",
                "A", 1, 74, "medium"));

        unit1Questions.add(new Question(
                "Which demonstrates effective prototyping?",
                "Creating a simple version of the artifact to test functionality before finalizing",
                "Writing the full program immediately without testing",
                "Skipping all user feedback",
                "Copying someone else’s project",
                "A", 1, 75, "medium"));

        unit1Questions.add(new Question(
                "What is the purpose of documenting a computational artifact?",
                "To explain how it works and how to use it effectively",
                "To make code run faster",
                "To replace testing",
                "To complicate code unnecessarily",
                "A", 1, 76, "medium"));

        unit1Questions.add(new Question(
                "Which scenario demonstrates evaluation of a computational artifact?",
                "Testing a program to ensure it meets user needs and goals",
                "Writing code without testing",
                "Ignoring feedback from users",
                "Copying code from others",
                "A", 1, 77, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best demonstrates creativity in CSP?",
                "Designing a novel solution to a problem that meets user needs",
                "Copying an existing program",
                "Printing static text only",
                "Ignoring the problem requirements",
                "A", 1, 78, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is a key goal of creative development?",
                "Producing an artifact that solves a problem while demonstrating originality",
                "Memorizing code syntax without applying it",
                "Copying solutions without understanding",
                "Avoiding user interaction",
                "A", 1, 79, "easy"));

        unit1Questions.add(new Question(
                "Which of the following best describes the role of iteration in creative development?",
                "Repeating steps to refine and improve the computational artifact",
                "Running the program once and never revising it",
                "Skipping testing entirely",
                "Copying code from other sources",
                "A", 1, 80, "medium"));

        unit1Questions.add(new Question(
                "Why is feedback important in developing a computational artifact?",
                "It helps identify issues and improve usability and functionality",
                "It is optional and unnecessary",
                "It guarantees the artifact will be perfect without changes",
                "It replaces testing",
                "A", 1, 81, "medium"));

        unit1Questions.add(new Question(
                "Which is an example of abstraction in AP CSP?",
                "Creating a function that performs a calculation without exposing the internal steps",
                "Repeating calculations multiple times",
                "Ignoring program structure",
                "Copying code from another project",
                "A", 1, 82, "medium"));

        unit1Questions.add(new Question(
                "Which step comes first in the creative development process?",
                "Defining the problem or purpose of the artifact",
                "Writing code immediately",
                "Running the program without planning",
                "Copying an example from a tutorial",
                "A", 1, 83, "easy"));

        unit1Questions.add(new Question(
                "Which of the following best demonstrates collaboration in CSP?",
                "Sharing ideas and reviewing code with teammates to improve the artifact",
                "Working alone without input",
                "Copying code from someone else",
                "Ignoring feedback entirely",
                "A", 1, 84, "medium"));

        unit1Questions.add(new Question(
                "Why is ethical consideration important in creating computational artifacts?",
                "To avoid harm and ensure the artifact benefits users and society",
                "It is unnecessary in most projects",
                "It only matters for exams",
                "It guarantees that the program will work perfectly",
                "A", 1, 85, "medium"));

        unit1Questions.add(new Question(
                "Which of the following best represents user-centered design?",
                "Designing a program that meets the needs and preferences of intended users",
                "Making a program only for the developer",
                "Adding features randomly without purpose",
                "Printing static text only",
                "A", 1, 86, "medium"));

        unit1Questions.add(new Question(
                "Which of the following demonstrates prototyping?",
                "Creating a preliminary version to test ideas and gather feedback",
                "Writing the final program immediately",
                "Skipping user input entirely",
                "Copying someone else’s project",
                "A", 1, 87, "medium"));

        unit1Questions.add(new Question(
                "Which action shows effective evaluation of a computational artifact?",
                "Testing it to see if it meets intended goals and functions correctly",
                "Ignoring feedback from users",
                "Writing code without running it",
                "Copying code from other sources",
                "A", 1, 88, "medium"));

        unit1Questions.add(new Question(
                "How does abstraction simplify problem-solving in CSP?",
                "By focusing only on relevant details and hiding complexity",
                "By repeating code multiple times",
                "By ignoring user needs",
                "By writing overly complex code",
                "A", 1, 89, "medium"));

        unit1Questions.add(new Question(
                "Which of the following demonstrates creative problem-solving?",
                "Designing a program that provides a new solution to a user need",
                "Copying existing programs without understanding",
                "Running code without modification",
                "Printing static text only",
                "A", 1, 90, "medium"));

        unit1Questions.add(new Question(
                "Which best describes the purpose of iteration in program development?",
                "Refining and improving the artifact through multiple versions",
                "Writing code once without changes",
                "Ignoring testing",
                "Copying solutions from others",
                "A", 1, 91, "medium"));

        unit1Questions.add(new Question(
                "Why is documentation important for computational artifacts?",
                "It explains how the artifact works and how to use it",
                "It makes code run faster",
                "It replaces testing",
                "It complicates the program unnecessarily",
                "A", 1, 92, "medium"));

        unit1Questions.add(new Question(
                "Which is an example of iteration in AP CSP?",
                "Improving a program repeatedly based on test results and user feedback",
                "Running the program once and never revising",
                "Skipping testing entirely",
                "Copying code from another student",
                "A", 1, 93, "medium"));

        unit1Questions.add(new Question(
                "How does user feedback contribute to creative development?",
                "It helps identify issues and make the artifact more effective and usable",
                "It is unnecessary for small projects",
                "It slows development without benefit",
                "It guarantees perfection without revision",
                "A", 1, 94, "medium"));

        unit1Questions.add(new Question(
                "Which of the following is a computational artifact?",
                "An interactive quiz program developed to teach a concept",
                "A static printed page",
                "A handwritten essay",
                "A sculpture",
                "A", 1, 95, "easy"));

        unit1Questions.add(new Question(
                "Why is collaboration beneficial in CSP projects?",
                "It allows sharing ideas and reviewing code to create better solutions",
                "It guarantees success without effort",
                "It replaces testing",
                "It is only needed for grading",
                "A", 1, 96, "medium"));

        unit1Questions.add(new Question(
                "Which scenario demonstrates effective use of abstraction?",
                "Using a function to handle complex tasks instead of repeating code",
                "Repeating the same code multiple times",
                "Copying code from a textbook",
                "Ignoring program structure",
                "A", 1, 97, "medium"));

        unit1Questions.add(new Question(
                "Which is an example of user-centered design in creative development?",
                "Designing a program that responds to user input and preferences",
                "Making a program only for the developer",
                "Adding features randomly",
                "Printing static text only",
                "A", 1, 98, "medium"));

        unit1Questions.add(new Question(
                "Which best demonstrates ethical responsibility in AP CSP?",
                "Ensuring a program does not harm users and respects privacy",
                "Skipping testing to save time",
                "Copying code from another source",
                "Ignoring user needs",
                "A", 1, 99, "medium"));


        numUnit1Questions = unit1Questions.size();
        System.out.println(String.format("There are %d questions in unit 1", numUnit1Questions));
    }

}