package com.Discord.DiscordBot.Z_Units;

import com.Discord.DiscordBot.Units.Question;

import static com.Discord.DiscordBot.Units.QuestionBank.unit3Questions;

public class Unit3 {

    public static int numUnit3Questions;

    public static void initializeUnit3Questions() {

        unit3Questions.add(new Question(
                "Which of the following best describes an algorithm?",
                "A step-by-step procedure to solve a problem or perform a task",
                "A programming language",
                "A random sequence of instructions",
                "A type of data structure",
                "A", 3, 2000, "easy"));

        unit3Questions.add(new Question(
                "Which of the following is an example of a simple algorithm?",
                "Finding the largest number in a list",
                "Compiling a Java program",
                "Installing software on a computer",
                "Writing documentation",
                "A", 3, 2001, "easy"));

        unit3Questions.add(new Question(
                "What is the primary purpose of a loop in programming?",
                "To repeat a set of instructions multiple times",
                "To store a single value",
                "To define a new variable",
                "To terminate the program",
                "A", 3, 2002, "easy"));

        unit3Questions.add(new Question(
                "Which of the following is true about conditional statements?",
                "They allow different code to run based on boolean conditions",
                "They are used only for loops",
                "They store data in arrays",
                "They compile code automatically",
                "A", 3, 2003, "easy"));

        unit3Questions.add(new Question(
                "Which best describes a function or method in programming?",
                "A reusable block of code that performs a specific task",
                "A type of variable",
                "A programming error",
                "A loop structure",
                "A", 3, 2004, "easy"));

        unit3Questions.add(new Question(
                "Which of these is an example of iteration using a for loop?",
                "for(int i = 0; i < 5; i++) { System.out.println(i); }",
                "if(x > 5) { System.out.println(x); }",
                "int x = 5;",
                "System.out.println('Hello');",
                "A", 3, 2005, "medium"));

        unit3Questions.add(new Question(
                "Which of the following describes recursion?",
                "A function calling itself to solve a problem",
                "A loop that never ends",
                "A variable storing multiple values",
                "A conditional statement",
                "A", 3, 2006, "medium"));

        unit3Questions.add(new Question(
                "Why is pseudocode useful in programming?",
                "It helps plan algorithms without worrying about syntax",
                "It executes the program faster",
                "It replaces the need for loops",
                "It ensures the program will run correctly without testing",
                "A", 3, 2007, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates sequencing in an algorithm?",
                "Executing steps in a specific, logical order",
                "Repeating steps indefinitely",
                "Making decisions based on conditions",
                "Storing data in a variable",
                "A", 3, 2008, "medium"));

        unit3Questions.add(new Question(
                "What is a key reason to use a while loop instead of a for loop?",
                "When the number of iterations is not known in advance",
                "When the loop should run a fixed number of times",
                "When you only need to store a variable",
                "When the program has no conditionals",
                "A", 3, 2009, "medium"));

        unit3Questions.add(new Question(
                "Which best describes a boolean expression in programming?",
                "An expression that evaluates to true or false",
                "A type of array",
                "A numeric calculation",
                "A loop counter",
                "A", 3, 2010, "easy"));

        unit3Questions.add(new Question(
                "Which of the following is an example of using an if-else statement?",
                "if(score >= 60) { System.out.println('Pass'); } else { System.out.println('Fail'); }",
                "for(int i=0;i<5;i++) { System.out.println(i); }",
                "int[] numbers = {1,2,3};",
                "System.out.println('Hello');",
                "A", 3, 2011, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates an algorithm using a list?",
                "Iterating through an array to find the sum of its elements",
                "Printing a single number",
                "Declaring a variable",
                "Creating a method with no input",
                "A", 3, 2012, "medium"));

        unit3Questions.add(new Question(
                "Which is an example of a loop that executes at least once?",
                "do { System.out.println('Hello'); } while(condition);",
                "for(int i=0;i<5;i++){...}",
                "if(x>0){...}",
                "int x = 0;",
                "A", 3, 2013, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about nested loops?",
                "A loop inside another loop that can be used for multi-dimensional data",
                "Loops that never end",
                "Loops that cannot contain conditionals",
                "Loops that store only a single value",
                "A", 3, 2014, "medium"));

        unit3Questions.add(new Question(
                "Why is modular programming important?",
                "It breaks a program into manageable functions or methods",
                "It makes the program longer",
                "It prevents debugging",
                "It avoids the use of loops",
                "A", 3, 2015, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of algorithm efficiency?",
                "Using a binary search instead of a linear search for a sorted array",
                "Adding numbers manually",
                "Printing every element multiple times",
                "Ignoring loops entirely",
                "A", 3, 2016, "medium"));

        unit3Questions.add(new Question(
                "Which statement best describes a parameter in a function?",
                "A value passed into a function to customize its behavior",
                "A variable declared outside any function",
                "A type of loop",
                "An error in the program",
                "A", 3, 2017, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a return statement?",
                "It sends a value back from a function to the calling code",
                "It repeats the loop",
                "It creates a new variable",
                "It stores a boolean expression",
                "A", 3, 2018, "medium"));

        unit3Questions.add(new Question(
                "Why is testing functions individually important?",
                "To ensure each function behaves correctly before integrating into the full program",
                "It is unnecessary if the program compiles",
                "It guarantees the program is bug-free",
                "It replaces documentation",
                "A", 3, 2019, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of a loop control variable?",
                "int i in for(int i = 0; i < 10; i++)",
                "int x = 5;",
                "boolean flag = true;",
                "System.out.println('Hello');",
                "A", 3, 2020, "easy"));

        unit3Questions.add(new Question(
                "Which of the following describes the use of a break statement?",
                "It exits a loop prematurely when a condition is met",
                "It restarts a loop from the beginning",
                "It declares a new variable inside a loop",
                "It evaluates a boolean expression",
                "A", 3, 2021, "medium"));

        unit3Questions.add(new Question(
                "Which scenario demonstrates using an algorithm to sort data?",
                "Arranging an array of numbers in ascending order",
                "Printing a single number",
                "Declaring a variable",
                "Creating a method with no input",
                "A", 3, 2022, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates a nested if statement?",
                "if(x > 0) { if(y > 0) { System.out.println('Both positive'); } }",
                "for(int i=0;i<5;i++){...}",
                "int[] numbers = {1,2,3};",
                "System.out.println('Hello');",
                "A", 3, 2023, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about an infinite loop?",
                "It runs forever unless externally stopped or a break statement is used",
                "It executes exactly once",
                "It stores multiple values",
                "It always produces an error",
                "A", 3, 2024, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of a sentinel-controlled loop?",
                "while(input != -1) { ... }",
                "for(int i=0; i<10; i++) { ... }",
                "do { ... } while(true);",
                "if(x > 0) { ... }",
                "A", 3, 2025, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a variable scope?",
                "The region of code where a variable is accessible",
                "The data type of a variable",
                "The value assigned to a variable",
                "The speed at which a variable is stored",
                "A", 3, 2026, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes algorithm correctness?",
                "An algorithm produces the expected output for all valid inputs",
                "It executes without any loops",
                "It avoids using functions",
                "It uses minimal variables",
                "A", 3, 2027, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates a logical error in programming?",
                "The program runs but produces incorrect output",
                "The program does not compile",
                "The program crashes immediately",
                "The program executes perfectly",
                "A", 3, 2028, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a parameterized function?",
                "A function that accepts input values to perform tasks",
                "A function without any code inside",
                "A variable declared outside a function",
                "A loop that repeats infinitely",
                "A", 3, 2029, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of a for-each loop in Java?",
                "for(int num : numbers) { System.out.println(num); }",
                "for(int i=0;i<10;i++){ System.out.println(i); }",
                "while(condition){ ... }",
                "do { ... } while(condition);",
                "A", 3, 2030, "medium"));

        unit3Questions.add(new Question(
                "Which best describes algorithm optimization?",
                "Improving an algorithm to run faster or use fewer resources",
                "Writing longer code for clarity",
                "Avoiding testing",
                "Copying existing solutions",
                "A", 3, 2031, "medium"));

        unit3Questions.add(new Question(
                "Which scenario best demonstrates the use of a helper function?",
                "Creating a separate function to perform a repeated calculation used in multiple places",
                "Writing the same code inline every time",
                "Skipping calculations entirely",
                "Using a variable without a function",
                "A", 3, 2032, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about a do-while loop?",
                "It executes the loop body at least once before checking the condition",
                "It never executes the body",
                "It checks the condition before executing",
                "It cannot contain nested loops",
                "A", 3, 2033, "medium"));

        unit3Questions.add(new Question(
                "Which best describes a Boolean flag in programming?",
                "A variable used to control logic based on true/false values",
                "A numeric counter",
                "A loop iterator",
                "A type of function",
                "A", 3, 2034, "medium"));

        unit3Questions.add(new Question(
                "Which scenario best demonstrates algorithm design?",
                "Planning steps to sort a list of names before coding",
                "Typing code randomly without plan",
                "Printing static text only",
                "Ignoring input validation",
                "A", 3, 2035, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes testing for edge cases?",
                "Checking how an algorithm handles unusual or extreme inputs",
                "Running the program once",
                "Ignoring invalid input",
                "Only checking typical cases",
                "A", 3, 2036, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates using a return value effectively?",
                "Returning the result of a calculation from a function to be used elsewhere",
                "Printing a value without storing it",
                "Ignoring the result of a calculation",
                "Declaring a variable inside a loop",
                "A", 3, 2037, "medium"));

        unit3Questions.add(new Question(
                "Which best describes a nested function call?",
                "Calling one function inside another function",
                "Declaring multiple functions consecutively",
                "Calling a function with no parameters",
                "Writing a function inside a loop",
                "A", 3, 2038, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is a correct use of a switch statement?",
                "switch(day) { case 1: System.out.println('Monday'); break; case 2: ... }",
                "if(x>0) { ... }",
                "for(int i=0;i<5;i++){...}",
                "while(condition){ ... }",
                "A", 3, 2039, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a greedy algorithm?",
                "An algorithm that makes the locally optimal choice at each step",
                "An algorithm that tests all possibilities",
                "An algorithm that always sorts data in ascending order",
                "An algorithm that uses recursion exclusively",
                "A", 3, 2040, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about a binary search algorithm?",
                "It efficiently finds a target value in a sorted array by repeatedly dividing the search interval in half",
                "It checks every element in the array sequentially",
                "It can be used on unsorted arrays without modification",
                "It sorts an array automatically",
                "A", 3, 2041, "medium"));

        unit3Questions.add(new Question(
                "Which best describes the purpose of a loop invariant?",
                "A condition that holds true before and after each iteration of a loop",
                "A variable used to count iterations",
                "A type of conditional statement",
                "An error in logic",
                "A", 3, 2042, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of a sequential search?",
                "Checking each element of an array one by one until the target is found",
                "Dividing the array in half repeatedly",
                "Sorting the array before searching",
                "Using a hash table for direct access",
                "A", 3, 2043, "medium"));

        unit3Questions.add(new Question(
                "Which of the following describes algorithm complexity?",
                "A measure of the resources (time or space) an algorithm uses relative to input size",
                "The number of functions in a program",
                "The length of a variable name",
                "The number of comments in code",
                "A", 3, 2044, "medium"));

        unit3Questions.add(new Question(
                "Which scenario best demonstrates recursion in a program?",
                "A function calling itself to calculate factorial values",
                "Using a for loop to iterate over numbers",
                "Printing values directly",
                "Storing numbers in an array without loops",
                "A", 3, 2045, "medium"));

        unit3Questions.add(new Question(
                "Which of the following describes a base case in recursion?",
                "The condition under which the recursive function stops calling itself",
                "A variable used inside the function",
                "The function call made repeatedly",
                "An error that occurs during recursion",
                "A", 3, 2046, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes divide and conquer algorithms?",
                "Algorithms that break a problem into smaller subproblems, solve them, and combine results",
                "Algorithms that always use loops",
                "Algorithms that only work with integers",
                "Algorithms that ignore input size",
                "A", 3, 2047, "medium"));

        unit3Questions.add(new Question(
                "Which is an advantage of using functions in programming?",
                "They allow code reuse and better organization",
                "They increase program length unnecessarily",
                "They prevent loops from running",
                "They eliminate the need for variables",
                "A", 3, 2048, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates using an array in an algorithm?",
                "Storing multiple values in a single variable to process collectively",
                "Declaring a single integer",
                "Printing static text repeatedly",
                "Ignoring input data",
                "A", 3, 2049, "medium"));

        unit3Questions.add(new Question(
                "Which best describes an algorithm with O(n^2) time complexity?",
                "The number of operations grows quadratically with input size",
                "The number of operations is constant",
                "The number of operations grows linearly",
                "The algorithm runs instantly",
                "A", 3, 2050, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is a common use of a stack in programming?",
                "To store elements in Last-In-First-Out (LIFO) order",
                "To sort numbers automatically",
                "To store elements in First-In-First-Out (FIFO) order",
                "To create an array of booleans",
                "A", 3, 2051, "medium"));

        unit3Questions.add(new Question(
                "Which scenario best demonstrates using a queue?",
                "Processing tasks in the order they arrive (FIFO)",
                "Accessing elements randomly",
                "Calling a function recursively",
                "Using nested loops for calculation",
                "A", 3, 2052, "medium"));

        unit3Questions.add(new Question(
                "Which of the following describes a greedy approach for coin change?",
                "Selecting the largest coin denomination first until the amount is met",
                "Trying all combinations systematically",
                "Starting with the smallest coin first",
                "Ignoring the coin values",
                "A", 3, 2053, "medium"));

        unit3Questions.add(new Question(
                "Which best describes an algorithm's correctness proof?",
                "Demonstrating that it produces the correct output for all valid inputs",
                "Running the algorithm once",
                "Counting the number of lines of code",
                "Ignoring special cases",
                "A", 3, 2054, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about a sentinel value in a loop?",
                "It indicates the end of input and stops the loop",
                "It starts the loop",
                "It counts the iterations",
                "It initializes a variable",
                "A", 3, 2055, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates a binary search tree traversal?",
                "Visiting nodes in a specific order such as in-order, pre-order, or post-order",
                "Sorting an array sequentially",
                "Using a loop to print numbers",
                "Storing variables in an array",
                "A", 3, 2056, "medium"));

        unit3Questions.add(new Question(
                "Which best describes algorithmic efficiency?",
                "How well an algorithm uses resources like time and memory relative to input size",
                "The number of comments in code",
                "The length of variable names",
                "The number of loops in a program",
                "A", 3, 2057, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about a recursive search algorithm?",
                "It repeatedly calls itself until a base case is met",
                "It uses a for loop only",
                "It ignores input data",
                "It always fails for large inputs",
                "A", 3, 2058, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates algorithm decomposition?",
                "Breaking a complex problem into smaller, manageable functions",
                "Writing all code in a single function",
                "Ignoring modularity",
                "Copying a program from another source",
                "A", 3, 2059, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a linear search algorithm?",
                "Checking each element in a list sequentially until the target is found",
                "Dividing the list in half repeatedly",
                "Sorting the list before searching",
                "Using a hash table for direct access",
                "A", 3, 2060, "medium"));

        unit3Questions.add(new Question(
                "Which best describes algorithm termination?",
                "An algorithm must eventually stop after a finite number of steps",
                "It can run forever without consequence",
                "It stops only when an error occurs",
                "It terminates only if input is zero",
                "A", 3, 2061, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is a valid use of recursion?",
                "Calculating Fibonacci numbers",
                "Printing static text",
                "Declaring variables",
                "Storing constants in an array",
                "A", 3, 2062, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a loop's precondition?",
                "The condition that must be true before the loop executes",
                "The loop body itself",
                "The result of the loop",
                "The final iteration only",
                "A", 3, 2063, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates using an array to store multiple values?",
                "int[] numbers = {1,2,3,4};",
                "int x = 5;",
                "boolean flag = true;",
                "System.out.println('Hello');",
                "A", 3, 2064, "easy"));

        unit3Questions.add(new Question(
                "Which best describes a function return type?",
                "The type of value the function produces and sends back to the caller",
                "The name of the function",
                "The variable scope",
                "The number of parameters",
                "A", 3, 2065, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best illustrates a nested loop?",
                "for(int i=0;i<3;i++){ for(int j=0;j<3;j++){ System.out.println(i+j); } }",
                "int x = 0;",
                "System.out.println('Hello');",
                "if(x>0){ ... }",
                "A", 3, 2066, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates a recursive base case?",
                "if(n == 0) return 1;",
                "while(true){ ... }",
                "for(int i=0;i<10;i++){ ... }",
                "int x = 5;",
                "A", 3, 2067, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about algorithm correctness?",
                "It produces the expected output for all valid inputs",
                "It executes without using loops",
                "It only runs for a single input",
                "It avoids using functions",
                "A", 3, 2068, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates modular programming?",
                "Breaking a program into multiple functions to simplify logic and reuse code",
                "Writing all code in a single main method",
                "Ignoring reusable functions",
                "Copying another program entirely",
                "A", 3, 2069, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes algorithmic analysis?",
                "Evaluating the efficiency and resource usage of an algorithm",
                "Counting the lines of code",
                "Printing output",
                "Ignoring time complexity",
                "A", 3, 2070, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates using a for-each loop with an array?",
                "for(int num : numbers){ System.out.println(num); }",
                "for(int i=0;i<5;i++){ System.out.println(i); }",
                "while(condition){ ... }",
                "do{ ... } while(condition);",
                "A", 3, 2071, "medium"));

        unit3Questions.add(new Question(
                "Which of the following describes a sentinel value in a loop?",
                "A special value that signals the end of input and terminates the loop",
                "The first element in an array",
                "The loop iterator",
                "The number of iterations",
                "A", 3, 2072, "medium"));

        unit3Questions.add(new Question(
                "Which best describes a recursive algorithm?",
                "An algorithm in which a function calls itself with a smaller input until a base case is reached",
                "A loop that runs infinitely",
                "A function with no parameters",
                "An algorithm without conditions",
                "A", 3, 2073, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about algorithm efficiency?",
                "It evaluates how fast and resource-efficient an algorithm is",
                "It counts the number of comments in code",
                "It measures the number of nested loops only",
                "It ignores input size",
                "A", 3, 2074, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates the use of a helper function?",
                "A separate function performing a repeated task called by multiple other functions",
                "Writing the same code inline every time",
                "Skipping calculations",
                "Using a variable without functions",
                "A", 3, 2075, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates algorithm decomposition?",
                "Breaking a complex problem into smaller functions or modules",
                "Writing all code in one function",
                "Ignoring modularity",
                "Copying code from another source",
                "A", 3, 2076, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates using a stack effectively?",
                "Storing elements in Last-In-First-Out (LIFO) order",
                "Sorting elements automatically",
                "Processing elements randomly",
                "Ignoring element order",
                "A", 3, 2077, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of algorithm testing?",
                "Running an algorithm with multiple input cases to ensure correct output",
                "Writing code without executing",
                "Declaring variables without using them",
                "Printing text only",
                "A", 3, 2078, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates handling edge cases in algorithms?",
                "Testing unusual or extreme inputs to ensure correct behavior",
                "Testing only typical cases",
                "Ignoring invalid input",
                "Running the program once without review",
                "A", 3, 2079, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about an algorithm's time complexity?",
                "It describes how the runtime grows as input size increases",
                "It measures the number of lines of code",
                "It determines the syntax correctness of a program",
                "It counts the number of functions",
                "A", 3, 2080, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of a divide and conquer algorithm?",
                "Merge sort",
                "Linear search",
                "Sequential addition",
                "Printing elements in a loop",
                "A", 3, 2081, "medium"));

        unit3Questions.add(new Question(
                "Which scenario demonstrates using recursion for a factorial calculation?",
                "int factorial(int n){ if(n==0) return 1; else return n*factorial(n-1); }",
                "for(int i=1;i<=n;i++){...}",
                "int sum = 0; for(int i=0;i<n;i++){ sum += i; }",
                "System.out.println(n);",
                "A", 3, 2082, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a loop invariant?",
                "A condition that remains true before and after each loop iteration",
                "A variable initialized in the loop",
                "A function called inside a loop",
                "The loop counter",
                "A", 3, 2083, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about bubble sort?",
                "It repeatedly swaps adjacent elements if they are in the wrong order",
                "It divides the array in half to search",
                "It uses recursion exclusively",
                "It uses a stack to store elements",
                "A", 3, 2084, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates a correct use of a do-while loop?",
                "do { System.out.println('Hello'); } while(condition);",
                "for(int i=0;i<5;i++){ System.out.println(i); }",
                "if(x>0){ ... }",
                "int x = 0;",
                "A", 3, 2085, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates using an array for algorithmic calculations?",
                "Storing multiple numeric values and iterating over them for computation",
                "Printing a single number",
                "Declaring a variable without using it",
                "Printing static text repeatedly",
                "A", 3, 2086, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about recursion depth?",
                "It refers to the number of times a recursive function calls itself before reaching the base case",
                "It measures the size of a variable",
                "It counts the number of loops in a program",
                "It describes memory usage of arrays",
                "A", 3, 2087, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates using a queue in a program?",
                "Processing elements in First-In-First-Out (FIFO) order",
                "Storing elements in Last-In-First-Out (LIFO) order",
                "Ignoring input data",
                "Copying elements randomly",
                "A", 3, 2088, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes algorithm debugging?",
                "Identifying and fixing logical errors to ensure correct results",
                "Writing code without testing",
                "Printing static text only",
                "Ignoring incorrect output",
                "A", 3, 2089, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates a greedy algorithm for scheduling tasks?",
                "Choosing the earliest finishing task first repeatedly",
                "Randomly selecting tasks",
                "Performing tasks sequentially without optimization",
                "Skipping tasks with dependencies",
                "A", 3, 2090, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a recursive tree traversal?",
                "Visiting nodes in a binary tree using a function that calls itself for child nodes",
                "Iterating over a flat array",
                "Printing values sequentially",
                "Sorting numbers in ascending order",
                "A", 3, 2091, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates modular algorithm design?",
                "Breaking a complex computation into multiple functions or modules",
                "Writing all code in one main method",
                "Ignoring code reuse",
                "Copying external code without understanding",
                "A", 3, 2092, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is true about a while loop with a sentinel value?",
                "It continues looping until a special input indicates termination",
                "It executes only once",
                "It uses a recursive function",
                "It ignores the sentinel value",
                "A", 3, 2093, "medium"));

        unit3Questions.add(new Question(
                "Which of the following is an example of algorithm analysis?",
                "Comparing the runtime of two sorting algorithms on large inputs",
                "Printing an array",
                "Declaring variables",
                "Ignoring time complexity",
                "A", 3, 2094, "medium"));

        unit3Questions.add(new Question(
                "Which of the following demonstrates handling edge cases in recursion?",
                "Checking for n==0 before making a recursive call",
                "Ignoring input values",
                "Running the function without parameters",
                "Printing values only",
                "A", 3, 2095, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a function parameter?",
                "A value passed into a function to customize its behavior",
                "A variable declared globally",
                "A loop counter",
                "A static constant",
                "A", 3, 2096, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best demonstrates an in-place algorithm?",
                "Sorting an array without using additional storage",
                "Copying elements into a new array to sort",
                "Printing elements sequentially",
                "Using a recursive helper function",
                "A", 3, 2097, "medium"));

        unit3Questions.add(new Question(
                "Which scenario demonstrates a stable sorting algorithm?",
                "Maintaining the relative order of equal elements after sorting",
                "Reversing elements arbitrarily",
                "Sorting elements without comparing them",
                "Using recursion only",
                "A", 3, 2098, "medium"));

        unit3Questions.add(new Question(
                "Which of the following best describes a hash table?",
                "A data structure that stores key-value pairs for efficient lookup",
                "An array sorted in ascending order",
                "A recursive function",
                "A loop counter",
                "A", 3, 2099, "medium"));


        numUnit3Questions = unit3Questions.size();
        System.out.printf("There are %d questions in unit 3%n", numUnit3Questions);
    }

}
