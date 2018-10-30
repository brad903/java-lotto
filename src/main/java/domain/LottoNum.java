package domain;


import java.util.Objects;


public class LottoNum {
    public static final int LOTTO_NUM_START = 1;
    public static final int LOTTO_NUM_END = 45;
    private final int lottoNum;

    public LottoNum(int lottoNum) {
        if(lottoNum < LOTTO_NUM_START || lottoNum > LOTTO_NUM_END) {
            throw new IllegalArgumentException("[로또 수가 범위 내에 있지 않은 것이 있습니다!]");
        }
        this.lottoNum = lottoNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNum lottoNum1 = (LottoNum) o;
        return lottoNum == lottoNum1.lottoNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lottoNum);
    }

    @Override
    public String toString() {
        return String.valueOf(lottoNum);
    }
}
