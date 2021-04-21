import React from "react";
import UserService from "./UserService";

class Usercomponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            users:[]
        }
    }
    componentDidMount() {
        UserService.getUsers().then ((response)=>{
            this.setState({ users: response.data})
        });
    }
    render () {
        return(
            <div>
                <h1 className="text-center"> List Of Users</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td> ID </td>
                            <td> First Name </td>
                            <td> Last Name </td>
                            <td> Email ID </td>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map(
                                user =>
                                <tr key = {user.id}>
                                    <td> {user.id} </td>
                                    <td> {user.firstname} </td>
                                    <td> {user.lastname} </td>
                                    <td> {user.email} </td>
                                </tr>

                            )
                        }    
                    </tbody>
                </table>

            </div>
        )
    }
}
export default Usercomponent