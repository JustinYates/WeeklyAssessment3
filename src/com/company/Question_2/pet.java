package com.company.Question_2;

import com.company.Question_1.Boy;
import com.company.Question_1.Girl;

abstract class pet extends Girl {
    public pet(String height, String color) {
        super(height, color);
    }

    abstract class pett extends Boy {
        public pett(String dislikes, String likes) {
            super(dislikes, likes);
        }
    }
}
