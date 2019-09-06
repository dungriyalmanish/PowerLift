package android.data.app.powerlift.model.db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;

@Entity(tableName = "exercise")
public class Exercise {
    @ColumnInfo(name = "date")
    String date;
    @ColumnInfo(name = "type")
    int type;
    @ColumnInfo(name = "part_a")
    float part_a;
    @ColumnInfo(name = "part_b")
    float part_b;
    @ColumnInfo(name = "support")
    boolean support;
    @ColumnInfo(name = "satisfied")
    boolean satisfied;
    @ColumnInfo(name = "repeat")
    boolean repeat;

    public Exercise(String date) {
        this.date = date;
    }

    public Exercise(String date, int type, float part_a, float part_b, boolean support, boolean satisfied, boolean repeat) {
        this.date = date;
        this.type = type;
        this.part_a = part_a;
        this.part_b = part_b;
        this.support = support;
        this.satisfied = satisfied;
        this.repeat = repeat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public float getPart_a() {
        return part_a;
    }

    public void setPart_a(float part_a) {
        this.part_a = part_a;
    }

    public float getPart_b() {
        return part_b;
    }

    public void setPart_b(float part_b) {
        this.part_b = part_b;
    }

    public boolean isSupport() {
        return support;
    }

    public void setSupport(boolean support) {
        this.support = support;
    }

    public boolean isSatisfied() {
        return satisfied;
    }

    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }
}
