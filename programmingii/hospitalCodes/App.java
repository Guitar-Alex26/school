public enum App {
    // Alexander Quirk
    // Codes and their corresponding definitions
    RED("Fire", "Call Fire Department and activate code Green"),
    BLUE("Cardiac Arrest", "Call cardiologist in charge"), 
    YELLOW("Bomb threat", "Call 911 and activate code Green"),
    ORANGE("Hazardous material spill", "Call Health and Safety"),
    GREEN("Evacuation", "Push the emergency button or alert hospital workers"),
    CLEAR("Situation has been resolved", "deactivate all code");
    // Values can not be changed
    final String text;
    final String function;
    // Constructor that assigns a code "text" and a "function" only when a new one is called
    App(String text, String function) {
        this.text = text;
        this.function = function;
    }
    // Get corresponding definition
    public String getText() {
        return text;
    }
    // Get necessary action; its function
    public String getFunction() {
        return function;
    }
    public static void main(String[] args) {
        // Loop through each code and its values: i.e. its text and function
        for (App code: App.values()) {
            System.out.println(code + ": " + code.getText() + ": " + code.getFunction());
        }
    }
}