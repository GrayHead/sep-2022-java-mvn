package lessons.lesson2.enums;

public enum Gender {
    MALE(true),FEMALE(false);
    private boolean isYchor;

    Gender(boolean isYchor) {
        this.isYchor = isYchor;
    }

    public boolean isYchor() {
        return isYchor;
    }
}
