package lotto.domain.dto;

import java.util.Arrays;
import java.util.LinkedHashMap;
import lotto.constant.Prize;

public record WinningResult(LinkedHashMap<Prize, Integer> prizes) {
    public static WinningResult of(Prize... prizes) {
        WinningResult result = new WinningResult(new LinkedHashMap<>());
        Arrays.stream(prizes)
                .forEach(prize -> result.prizes.put(prize, 0));
        return result;
    }
}
