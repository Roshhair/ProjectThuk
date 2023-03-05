import React, { Component } from 'react'
import { Signin } from './Signin'
import { Signup } from './Signup'
import './LoginAndSignup.css'


export default class LoginAndSignup extends Component {
    constructor(props) {
        super(props)

        this.state = {
            isSignup: true
        }
    }

    render() {
        // console.log(this.props)

        return this.props.show &&
            (<>
                <div className='background'  onClick={this.props.setShowFalse}>
                </div>
                <div className='form col-3' >
                    <span className='cross' onClick={this.props.setShowFalse}>
                        <img className='cross-image' src={require('../Images/cross.png')} alt='Cross'/>
                    </span>
                    <br />
                    <div>
                        <button className='topicbutton' onClick={() => { this.setState({ isSignup: true }) }}>Sign In</button>
                        <button className='topicbutton' onClick={() => { this.setState({ isSignup: false }) }}>Sign Up</button>
                    </div>
                    <hr />
                    {this.state.isSignup ? <Signin /> : <Signup />}
                </div>
            </>


            );
    }
}
