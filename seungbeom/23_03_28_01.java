// https://school.programmers.co.kr/learn/courses/30/lessons/42889

class Solution {
    public int[] solution(int N, int[] stages) {

        // 각 단계에 대한 도전자 수를 구함
        int[] challengers = new int[N + 1];
        for (int stage : stages) {
            challengers[stage - 1] += 1;
        }

        // 실패율 배열을 만듦
        float[] failureRates = new float[N];
        float denominator = stages.length;
        for (int i = 0; i < failureRates.length; i++) {
            int numerator = challengers[i];
            float failureRate;
            if (denominator == 0) {
                failureRate = 0.0f;
            } else {
                failureRate = numerator / denominator;
            }
            denominator -= numerator;
            failureRates[i] = failureRate;
        }

        // 정렬
        int[] answer = new int[N];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = i + 1;
        }
        mergeSort(failureRates, answer, 0, failureRates.length - 1);

        return answer;
    }

    public void mergeSort(float[] failureRates, int[] stages, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;

        mergeSort(failureRates, stages, left, mid);
        mergeSort(failureRates, stages, mid + 1, right);

        merge(failureRates, stages, left, mid, right);
    }

    public void merge(float[] failureRates, int[] stages, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int index = left;

        float[] tempRates = new float[failureRates.length];
        int[] tempStages = new int[stages.length];

        while (i <= mid && j <= right) {
            if (failureRates[i] >= failureRates[j]) {
                tempRates[index] = failureRates[i];
                tempStages[index++] = stages[i++];
            } else {
                tempRates[index] = failureRates[j];
                tempStages[index++] = stages[j++];
            }
        }

        while (i <= mid) {
            tempRates[index] = failureRates[i];
            tempStages[index++] = stages[i++];
        }

        while (j <= right) {
            tempRates[index] = failureRates[j];
            tempStages[index++] = stages[j++];
        }

        for (int x = left; x < index; x++) {
            failureRates[x] = tempRates[x];
            stages[x] = tempStages[x];
        }
    }
}