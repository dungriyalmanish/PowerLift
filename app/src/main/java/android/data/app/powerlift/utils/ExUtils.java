package android.data.app.powerlift.utils;

public class ExUtils {
    public static String getExercise(int type) {
        String ret;
        switch (type) {
            case DataConstants.SQ_EX:
                ret = DataConstants.SQ;
                break;
            case DataConstants.BP_EX:
                ret = DataConstants.BP;
                break;
            case DataConstants.BR_EX:
                ret = DataConstants.BR;
                break;
            case DataConstants.DL_EX:
                ret = DataConstants.DL;
                break;
            case DataConstants.OP_EX:
                ret = DataConstants.OP;
                break;
            default:
                ret = DataConstants.DEAD;
        }
        return ret;
    }

    public String getDateString(int dd, int mm, int yy) {
        return dd + "" + mm + "" + yy;
    }
}
