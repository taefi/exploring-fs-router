import {NavLink} from "react-router";

export default function ProductListView() {
    return (
        <div>
            <h1>Products List</h1>
            <NavLink to='/products/456/edit'>Edit Product with id = '456'</NavLink>
            <br />
            <NavLink to='/products/456'>View details of Product with id = '456'</NavLink>
        </div>
    );
}