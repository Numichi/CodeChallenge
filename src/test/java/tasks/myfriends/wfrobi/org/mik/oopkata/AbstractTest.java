package tasks.myfriends.wfrobi.org.mik.oopkata;

import org.junit.After;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public abstract class AbstractTest {

	private final static int LIMITS[] = new int[] {55, 65, 76, 88};
	private final static int MAX_POINTS = 127; //Define max points here

	private int result;

	protected String student = Exam.getName();
	protected String studentCode = Exam.getNeptunCode();

	@After
	public void calcResult() {
		try {
			String current = new File( "." ).getCanonicalPath(); //$NON-NLS-1$

			Path out = Paths.get(new StringBuilder(current).append(File.separatorChar)+"result.txt"); //$NON-NLS-1$
			String mark = getMark();
			try (BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
			    writer.write(String.format("%s;%s;%d;%s\n", //$NON-NLS-1$
			    		this.student, this.studentCode, Integer.valueOf(this.result), mark));
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
			System.out.println(String.format("%s (%s), points:%d/%d, mark:%s", //$NON-NLS-1$
					this.student, this.studentCode, Integer.valueOf(this.result), Integer.valueOf(MAX_POINTS), mark));
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private String getMark() {
		int percent = Math.round(((float)this.result/(float)MAX_POINTS) * 100.0f);
		for (int i=0;i<LIMITS.length;++i)
			if (percent < LIMITS[i])
				return Integer.toString(i+1);

		return Integer.toString(5);
	}

	protected void increaseResult(int value) {
		this.result += value;
	}

}
