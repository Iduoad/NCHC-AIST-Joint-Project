import mr.job.IntraHD_1;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ToolRunner;

/**
 * Created by 1403035 on 2015/8/24.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Configuration conf = new Configuration();
        conf.set("mapreduce.input.fileinputformat.split.maxsize","5242880");
        conf.set("mapreduce.job.queuename","root.MR");
        int res = ToolRunner.run(conf, new IntraHD_1(), args);
        System.exit(res);

    }
}
