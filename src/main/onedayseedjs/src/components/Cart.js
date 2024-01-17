import React from 'react';
import CartList from './CartList';
import 'bootstrap/dist/css/bootstrap.min.css'

function Cart() {
    return (
        <>
            <h1>장바구니</h1>
            <hr />
            <CartList />
            <hr />
        </>
    );
}

export default Cart;