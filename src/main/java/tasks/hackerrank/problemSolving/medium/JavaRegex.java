package tasks.hackerrank.problemSolving.medium;

class JavaRegex {
    String pattern;
    
    JavaRegex() {
        String item = "([0]{1,3}|0?0?[1-9]{1}|0?[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        
        pattern = item + "\\." + item + "\\." + item + "\\." + item;
    }
}
