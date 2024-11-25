import java.util.Scanner;
public class Survey09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRespondents = 10; // Number of respondents
        int numQuestions = 6;    // Number of questions

        int[][] surveyData = new int[numRespondents][numQuestions];
        System.out.println("Please enter the survey responses (1 to 5) for each respondent:");

        for (int i = 0; i < numRespondents; i++) {
            System.out.println("Enter responses for Respondent " + (i + 1) + ":");
            for (int j = 0; j < numQuestions; j++) {
                while (true) {
                    System.out.print("Question " + (j + 1) + " (1-5): ");
                    int response = sc.nextInt();
                    if (response >= 1 && response <= 5) {
                        surveyData[i][j] = response;
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    }
                }
            }
        }

        System.out.println("\nSurvey Results (Respondent x Question):");
        for (int i = 0; i < numRespondents; i++) {
            for (int j = 0; j < numQuestions; j++) {
                System.out.print(surveyData[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nAverage value for each respondent:");
        for (int i = 0; i < numRespondents; i++) {
            double sum = 0;
            for (int j = 0; j < numQuestions; j++) {
                sum += surveyData[i][j];
            }
            double average = sum / numQuestions;
            System.out.println("Respondent " + (i + 1) + ": " + average);
        }

        System.out.println("\nAverage value for each question:");
        for (int j = 0; j < numQuestions; j++) {
            double sum = 0;
            for (int i = 0; i < numRespondents; i++) {
                sum += surveyData[i][j];
            }
            double average = sum / numRespondents;
            System.out.println("Question " + (j + 1) + ": " + average);
        }

        double overallSum = 0;
        int totalResponses = 0;
        for (int i = 0; i < numRespondents; i++) {
            for (int j = 0; j < numQuestions; j++) {
                overallSum += surveyData[i][j];
                totalResponses++;
            }
        }
        double overallAverage = overallSum / totalResponses;
        System.out.println("\nOverall average: " + overallAverage);
    }
}
