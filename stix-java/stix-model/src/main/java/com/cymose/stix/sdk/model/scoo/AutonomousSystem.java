package com.cymose.stix.sdk.model.scoo;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class AutonomousSystem extends StixObservableCommonData
{
    @SerializedName("number")
    private int number;
    @SerializedName("name")
    private String name = null;
    @SerializedName("rir")
    private String rir = null;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRir() {
        return rir;
    }

    public void setRir(String rir) {
        this.rir = rir;
    }

    @Override
    public String toString() {
        return "AutonomousSystem{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", rir='" + rir + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, name, rir);
    }
}
