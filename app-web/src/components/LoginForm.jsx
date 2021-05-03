import {useState} from 'react'

export default function LoginForm(){
    const [user, setUser] = useState({
        email : "",
        password : "",
    });

    function onChange(event){
        const {name, value} = event.target;
        setUser({
            ...user,
            [name]: value
        })
    }

    return(
    <div>
        <h2>로그인</h2>
        <label>이메일</label>
        <input type="text" value={user.email} name="email" placeholder="이메일을 입력하세요" onChange={onChange} />
        <label>비밀번호</label>
        <input type="password" value={user.password} name="password" placeholder="비밀번호를 입력하세요" onChange={onChange} />
    </div>)
}