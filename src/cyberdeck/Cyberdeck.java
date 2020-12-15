package cyberdeck;

/**
 * This interface, named after the in-universe headset, contains all the methods necessary to make
 * the tool work. Implementations can be for any edition of Cyberpunk, but care must be taken to
 * code methods in a way that would make sense within that system. A Cyberpunk Red module will have
 * a wildly different way to track Netrunners than a Cyberpunk 2020 module. However, it is designed
 * be modular to be easy to mix different aspects of Cyberpunk editions.
 */
public interface Cyberdeck {

    /**
     * Shows all available commands, and if the following token is a command, shows a detailed
     * description of the specific command.
     */
    public abstract String help();

    /**
     * Rolls the specified number and type of dice.
     */
    public default int roll(int num, int type) {

    } //roll

    /**
     * Brings the user to the specified section of lore.
     */
    public abstract String info(String section);

    /**
     * Runs the loop that accepts user input.
     */
    public void commandPrompt();

} //Cyberdeck
