/*
 * GROOVE: GRaphs for Object Oriented VErification Copyright 2003--2007
 * University of Twente
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * $Id: IntSignature.java 5788 2016-08-04 16:09:44Z rensink $
 */
package groove.algebra;

import static groove.util.parse.OpKind.ADD;
import static groove.util.parse.OpKind.COMPARE;
import static groove.util.parse.OpKind.EQUAL;
import static groove.util.parse.OpKind.MULT;
import static groove.util.parse.OpKind.UNARY;

import groove.annotation.InfixSymbol;
import groove.annotation.PrefixSymbol;
import groove.annotation.Syntax;
import groove.annotation.ToolTipBody;
import groove.annotation.ToolTipHeader;

/**
 * The signature for integer algebras.
 * @param <INT> The representation type of the integer algebra
 * @param <REAL> The representation type of the real algebra
 * @param <BOOL> The representation type of the boolean algebra
 * @param <STRING> The representation type of the string algebra

 * @author Arend Rensink
 * @version $Revision: 5788 $
 */
public abstract class IntSignature<INT,REAL,BOOL,STRING> implements Signature {
    /** Absolute value of an integer. */
    @Syntax("Q%s.LPAR.i.RPAR")
    @ToolTipHeader("Absolute integer value")
    @ToolTipBody("Returns the absolute value of %s")
    public abstract INT abs(INT arg);

    /** Addition of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Integer addition")
    @ToolTipBody("Returns the sum of %s and %s")
    @InfixSymbol(symbol = "+", kind = ADD)
    public abstract INT add(INT arg0, INT arg1);

    /** Division of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Integer division")
    @ToolTipBody("Returns the integer quotient of %s and %s")
    @InfixSymbol(symbol = "/", kind = MULT)
    public abstract INT div(INT arg0, INT arg1);

    /** Equality test. */
    @ToolTipHeader("Integer equality test")
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipBody("Yields TRUE if integer %s equals integer %s")
    @InfixSymbol(symbol = "==", kind = EQUAL)
    public abstract BOOL eq(INT arg0, INT arg1);

    /** Greater-or-equal comparison. */
    @ToolTipHeader("Integer greater-or-equal test")
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipBody("Yields TRUE if integer %s is larger than integer %s")
    @InfixSymbol(symbol = ">=", kind = COMPARE)
    public abstract BOOL ge(INT arg0, INT arg1);

    /** Greater-than comparison. */
    @ToolTipHeader("Integer greater-than test")
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipBody("Yields TRUE if integer %2$s is properly larger than integer %1$s")
    @InfixSymbol(symbol = ">", kind = COMPARE)
    public abstract BOOL gt(INT arg0, INT arg1);

    /** Lesser-or-equal comparison. */
    @ToolTipHeader("Integer lesser-or-equal test")
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipBody("Yields TRUE if integer %s is smaller than integer %s")
    @InfixSymbol(symbol = "<=", kind = COMPARE)
    public abstract BOOL le(INT arg0, INT arg1);

    /** Lesser-than comparison. */
    @ToolTipHeader("Integer lesser-than test")
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipBody("Yields TRUE if integer %s is properly smaller than integer %s")
    @InfixSymbol(symbol = "<", kind = COMPARE)
    public abstract BOOL lt(INT arg0, INT arg1);

    /** Maximum of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Integer maximum")
    @ToolTipBody("Returns the maximum of %s and %s")
    public abstract INT max(INT arg0, INT arg1);

    /** Minimum of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Integer minimum")
    @ToolTipBody("Returns the minimum of %s and %s")
    public abstract INT min(INT arg0, INT arg1);

    /** Modulo of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Modulo")
    @ToolTipBody("Returns the remainder after dividing %s by %s")
    @InfixSymbol(symbol = "%", kind = MULT)
    public abstract INT mod(INT arg0, INT arg1);

    /** Multiplication of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Integer multiplication")
    @ToolTipBody("Returns the product of %s and %s")
    @InfixSymbol(symbol = "*", kind = MULT)
    public abstract INT mul(INT arg0, INT arg1);

    /** Inequality test. */
    @ToolTipHeader("Integer inequality test")
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipBody("Yields TRUE if integer %s does not equal integer %s")
    @InfixSymbol(symbol = "!=", kind = EQUAL)
    public abstract BOOL neq(INT arg0, INT arg1);

    /** Inversion. */
    @ToolTipHeader("Integer inversion")
    @Syntax("Q%s.LPAR.i1.RPAR")
    @ToolTipBody("Yields the inverse of %s")
    @PrefixSymbol(symbol = "-", kind = UNARY)
    public abstract INT neg(INT arg);

    /** Subtraction of two integers. */
    @Syntax("Q%s.LPAR.i1.COMMA.i2.RPAR")
    @ToolTipHeader("Integer subtraction")
    @ToolTipBody("Returns the difference between %s and %s")
    @InfixSymbol(symbol = "-", kind = ADD)
    public abstract INT sub(INT arg0, INT arg1);

    /** String representation. */
    @ToolTipHeader("Integer-to-string conversion")
    @Syntax("Q%s.LPAR.i1.RPAR")
    @ToolTipBody("Yields a string representation of %s")
    public abstract STRING toString(INT arg);

    /** Real number conversion. */
    @ToolTipHeader("Integer-to-real conversion")
    @Syntax("Q%s.LPAR.i1.RPAR")
    @ToolTipBody("Converts %s to a real number")
    @PrefixSymbol(symbol = "(real)", kind = UNARY)
    public abstract REAL toReal(INT arg);

    @Override
    public Sort getSort() {
        return Sort.INT;
    }

    /** Integer constant for the value zero. */
    public static final Constant ZERO = Constant.instance(0);

    /** Enumeration of all operators defined in this signature. */
    public enum Op implements Signature.OpValue {
        /** Value for {@link #abs(Object)}. */
        ABS,
        /** Value for {@link #add(Object, Object)}. */
        ADD,
        /** Value for {@link #div(Object, Object)}. */
        DIV,
        /** Value for {@link #eq(Object, Object)}. */
        EQ,
        /** Value for {@link #ge(Object, Object)}. */
        GE,
        /** Value for {@link #gt(Object, Object)}. */
        GT,
        /** Value for {@link #le(Object, Object)}. */
        LE,
        /** Value for {@link #lt(Object, Object)}. */
        LT,
        /** Value for {@link #max(Object, Object)}. */
        MAX,
        /** Value for {@link #min(Object, Object)}. */
        MIN,
        /** Value for {@link #mod(Object, Object)}. */
        MOD,
        /** Value for {@link #mul(Object, Object)}. */
        MUL,
        /** Value for {@link #neq(Object, Object)}. */
        NEQ,
        /** Value for {@link #neq(Object, Object)}. */
        NEG,
        /** Value for {@link #sub(Object, Object)}. */
        SUB,
        /** Value for {@link #toReal(Object)}. */
        TO_REAL,
        /** Value for {@link #toString(Object)}. */
        TO_STRING,;

        @Override
        public Operator getOperator() {
            if (this.operator == null) {
                this.operator = Operator.newInstance(Sort.INT, this);
            }
            return this.operator;
        }

        /** Corresponding operator object. */
        private Operator operator;
    }
}
