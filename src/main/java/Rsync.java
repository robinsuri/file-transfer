import com.github.fracpete.processoutput4j.output.ConsoleOutputProcessOutput;
import com.github.fracpete.rsync4j.Ssh;

public class Rsync {
  public static void main(String[] args) throws Exception {
    Ssh ssh = new Ssh()
        .identifyFile("/Users/robin.su/Documents/Checkout/largeFile-transfer-java/src/main/resources/id_rsa")
        .outputCommandline(true)
        .verbose(1)
        .hostname("staging1-sg-1b.aws.zeta.in")
        .command("ls /home/robinsu/sftp");
    ConsoleOutputProcessOutput output = new ConsoleOutputProcessOutput();
    output.monitor(ssh.builder());

  }
}
