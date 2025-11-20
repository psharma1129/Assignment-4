
package com.example.demo2;

public class horrorCharacter {
    private String characterName;
    private String weakness;
    private boolean transformation;

    public horrorCharacter(String characterName, String weakness, boolean transformation) {
        this.characterName = characterName;
        this.weakness = weakness;
        this.transformation = transformation;
    }

    public String getCharacterName() { return characterName; }
    public void setCharacterName(String characterName) { this.characterName = characterName; }

    public String getWeakness() { return weakness; }
    public void setWeakness(String weakness) { this.weakness = weakness; }

    public boolean isTransformation() { return transformation; }
    public void setTransformation(boolean transformation) { this.transformation = transformation; }

    @Override
    public String toString() {
        return characterName + " (weakness: " + weakness + ", transformed: " + transformation + ")";
    }
}