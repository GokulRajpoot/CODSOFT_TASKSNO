package com.codsoft;

public class Course {
    private final String code;
    private final String title;
    private final String description;
    private final int capacity;
    private final String schedule;
    private int enrolled;

    public Course(String code, String title, String description, int capacity, String schedule) {
        this.code = code.toUpperCase();
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getCapacity() { return capacity; }
    public String getSchedule() { return schedule; }
    public int getEnrolled() { return enrolled; }
    public int getAvailableSlots() { return capacity - enrolled; }
    public boolean hasSlot() { return enrolled < capacity; }

    public boolean enroll() {
        if (!hasSlot()) return false;
        enrolled++;
        return true;
    }

    public boolean drop() {
        if (enrolled == 0) return false;
        enrolled--;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-28s %-18s Slots: %d/%d%n         %s",
                code, title, schedule, getAvailableSlots(), capacity, description);
    }
}
