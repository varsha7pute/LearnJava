package com.cg.evaluation;

import java.util.Optional;

public class MorganEvaOptionalClass {
        public static void main(String[] args) {
            String value = null;
            Optional<String> optional = Optional.of(value);
            System.out.println(optional.get());
        }
}
