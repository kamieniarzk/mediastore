import React, {useState, useEffect, useCallback} from 'react';
import './App.css';
import axios from "axios";
import {useDropzone} from 'react-dropzone'

const UserProfiles = () => {

  const [userProfiles, setUserProfiles] = useState([]);
  const fetchUserProfiles = () => {
    axios.get("http://localhost:8080/api/userprofile").then(res => {
      setUserProfiles(res.data);
  });
  }

  useEffect(() => {
    fetchUserProfiles();
  }, []);

  return userProfiles.map((profile, index) => {
    return (
      <div key={index}>
        {/* todo: image */}
        <br/><br/>
        <h1>{profile.username}</h1>
        <p>{profile.id}</p>
        <Dropzone userId={profile.id}/>
      </div>
    );
  });
}

function Dropzone( {userId} ) {
  const onDrop = useCallback(acceptedFiles => {
    const formData = new FormData();
    formData.append("file", acceptedFiles[0]);
    axios.post(
      `http://localhost:8080/api/userprofile/${userId}/image/upload`,
      formData,
      {
        headers: {
          "Content-Type": "multipart/form-data"
        }
      }).then(() => {
        console.log(`file uploaded successfuly`)
      }).catch(err => {
        console.log(err); 
      });
  }, []);
  const {getRootProps, getInputProps, isDragActive} = useDropzone({onDrop})

  return (
    <div {...getRootProps()}>
      <input {...getInputProps()} />
      {
        isDragActive ?
          <p>Drop the files here ...</p> :
          <p>Drag 'n' drop some files here, or click to select files</p>
      }
    </div>
  )
}

function App() {
  return (
    <div className="App">
      <UserProfiles />
    </div>
  );
}

export default App;
